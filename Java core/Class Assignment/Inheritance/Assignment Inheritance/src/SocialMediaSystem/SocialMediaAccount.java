package SocialMediaSystem;

// Superclass
class SocialMediaAccount {
    String username;
    String email;
    boolean isPublic;
    boolean isVerified;
    String countryOfOrigin;
    int noOfPosts;
    int likes;
    int comments;
    String createdDate;
    int noOfImpressions;

    // Constructor
    SocialMediaAccount(String username, String email, boolean isPublic, boolean isVerified,
                       String countryOfOrigin, int noOfPosts, int likes, int comments,
                       String createdDate, int noOfImpressions) {
        this.username = username;
        this.email = email;
        this.isPublic = isPublic;
        this.isVerified = isVerified;
        this.countryOfOrigin = countryOfOrigin;
        this.noOfPosts = noOfPosts;
        this.likes = likes;
        this.comments = comments;
        this.createdDate = createdDate;
        this.noOfImpressions = noOfImpressions;
    }

    // Display
    void display() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Is Public: " + isPublic);
        System.out.println("Is Verified: " + isVerified);
        System.out.println("Country: " + countryOfOrigin);
        System.out.println("No. of Posts: " + noOfPosts);
        System.out.println("Likes: " + likes);
        System.out.println("Comments: " + comments);
        System.out.println("Created Date: " + createdDate);
        System.out.println("Impressions: " + noOfImpressions);
    }
}

// Subclass 1 - Instagram Account
class InstagramAccount extends SocialMediaAccount {
    int noOfFollowers;
    int noOfFollowing;
    int noOfHighlights;
    int noOfPostArchive;
    int noOfStoryArchive;
    int noOfAudioSaved;

    // Constructor
    InstagramAccount(String username, String email, boolean isPublic, boolean isVerified, String countryOfOrigin,
                     int noOfPosts, int likes, int comments, String createdDate, int noOfImpressions,
                     int noOfFollowers, int noOfFollowing, int noOfHighlights,
                     int noOfPostArchive, int noOfStoryArchive, int noOfAudioSaved) {

        super(username, email, isPublic, isVerified, countryOfOrigin, noOfPosts, likes, comments, createdDate, noOfImpressions);
        this.noOfFollowers = noOfFollowers;
        this.noOfFollowing = noOfFollowing;
        this.noOfHighlights = noOfHighlights;
        this.noOfPostArchive = noOfPostArchive;
        this.noOfStoryArchive = noOfStoryArchive;
        this.noOfAudioSaved = noOfAudioSaved;
    }

    void display() {
        System.out.println("Platform: Instagram");
        super.display();
        System.out.println("Followers: " + noOfFollowers);
        System.out.println("Following: " + noOfFollowing);
        System.out.println("Highlights: " + noOfHighlights);
        System.out.println("Post Archives: " + noOfPostArchive);
        System.out.println("Story Archives: " + noOfStoryArchive);
        System.out.println("Audio Saved: " + noOfAudioSaved);
        System.out.println("--------------------------------------");
    }
}

// Subclass 2 - YouTube Account
class YouTubeAccount extends SocialMediaAccount {
    int noOfSubscribers;
    double watchTime;
    boolean isMonetized;
    double estimatedRevenue;

    // Constructor
    YouTubeAccount(String username, String email, boolean isPublic, boolean isVerified, String countryOfOrigin,
                   int noOfPosts, int likes, int comments, String createdDate, int noOfImpressions,
                   int noOfSubscribers, double watchTime, boolean isMonetized, double estimatedRevenue) {

        super(username, email, isPublic, isVerified, countryOfOrigin, noOfPosts, likes, comments, createdDate, noOfImpressions);
        this.noOfSubscribers = noOfSubscribers;
        this.watchTime = watchTime;
        this.isMonetized = isMonetized;
        this.estimatedRevenue = estimatedRevenue;
    }

    void display() {
        System.out.println("Platform: YouTube");
        super.display();
        System.out.println("Subscribers: " + noOfSubscribers);
        System.out.println("Watch Time: " + watchTime + " hrs");
        System.out.println("Monetized: " + isMonetized);
        System.out.println("Estimated Revenue: $" + estimatedRevenue);
        System.out.println("--------------------------------------");
    }
}

// Subclass 3 - LinkedIn Account
class LinkedInAccount extends SocialMediaAccount {
    int noOfConnections;
    int noOfProfileViews;
    int noOfJobsApplied;

    // Constructor
    LinkedInAccount(String username, String email, boolean isPublic, boolean isVerified, String countryOfOrigin,
                    int noOfPosts, int likes, int comments, String createdDate, int noOfImpressions,
                    int noOfConnections, int noOfProfileViews, int noOfJobsApplied) {

        super(username, email, isPublic, isVerified, countryOfOrigin, noOfPosts, likes, comments, createdDate, noOfImpressions);
        this.noOfConnections = noOfConnections;
        this.noOfProfileViews = noOfProfileViews;
        this.noOfJobsApplied = noOfJobsApplied;
    }

    void display() {
        System.out.println("Platform: LinkedIn");
        super.display();
        System.out.println("Connections: " + noOfConnections);
        System.out.println("Profile Views: " + noOfProfileViews);
        System.out.println("Jobs Applied: " + noOfJobsApplied);
        System.out.println("--------------------------------------");
    }
}

// Test class
class TestSocialMedia {
    public static void main(String[] args) {

        InstagramAccount ig = new InstagramAccount("rutuj_insta", "rutuj@example.com", true, true, "India",
                250, 12000, 850, "2021-03-18", 550000,
                3000, 500, 12, 50, 100, 20);

        YouTubeAccount yt = new YouTubeAccount("RutujYT", "rutujyt@example.com", true, false, "India",
                180, 40000, 1200, "2020-07-12", 1000000,
                20000, 12500.5, true, 560.75);

        LinkedInAccount li = new LinkedInAccount("RutujLinkedIn", "rutujli@example.com", true, true, "India",
                35, 1200, 200, "2022-02-10", 50000,
                450, 1200, 5);

        ig.display();
        yt.display();
        li.display();
    }
}
