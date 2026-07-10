package recursion;

import java.util.ArrayList;
import java.util.List;

class Comment {
    String text;
    List<Comment> replies;

    Comment(String text) {
        this.text = text;
        this.replies = new ArrayList<>();
    }

    void addReply(Comment reply) {
        this.replies.add(reply);
    }
}

public class SocialMediaRecursion {
    // Real-life recursion: Count total replies under a comment
    public static int countTotalReplies(Comment comment) {
        if (comment.replies.isEmpty()) { // BASE CASE
            return 0;
        }
        int total = comment.replies.size(); // Count direct replies
        for (Comment reply : comment.replies) {
            total += countTotalReplies(reply); // RECURSIVE CALL (going deeper into replies of replies)
        }
        return total;
    }

    // Extra: Print nested comments beautifully
    public static void printThread(Comment comment, int level) {
        // Print indentation
        for (int i = 0; i < level; i++) System.out.print("  ");
        System.out.println("└─ " + comment.text);
        for (Comment reply : comment.replies) {
            printThread(reply, level + 1);
        }
    }

    public static void main(String[] args) {
        // Build a real-life comment thread
        Comment post = new Comment("📢 'Java is awesome!' - Post");

        Comment c1 = new Comment("I love Java!");
        Comment c2 = new Comment("Python is better!");

        // Replies to c1
        Comment c1r1 = new Comment("Me too!");
        Comment c1r2 = new Comment("Have you tried Spring?");
        c1.addReply(c1r1);
        c1.addReply(c1r2);

        // Reply to c1r1 (nested deeply!)
        Comment c1r1r1 = new Comment("Yes, Spring Boot is great!");
        c1r1.addReply(c1r1r1);

        // Replies to c2
        Comment c2r1 = new Comment("But Java is faster.");
        c2.addReply(c2r1);

        // Add main comments to post
        post.addReply(c1);
        post.addReply(c2);

        System.out.println("===== COMMENT THREAD (REAL LIFE) =====");
        printThread(post, 0);

        System.out.println("\n===== RECURSIVE COUNT =====");
        int total = countTotalReplies(post);
        System.out.println("Total number of replies on this post: " + total);
        // Explanation of how recursion counted it.
    }
}