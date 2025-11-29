package SocialsAbstract;

// Superclass
abstract class SocialMediaAccount {
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

    // ABSTRACT toString
    public abstract String toString();
}

// Subclass 1 - Instagram Account
class InstagramAccount extends SocialMediaAccount {

    int noOfFollowers;
    int noOfFollowing;
    int noOfHighlights;
    int noOfPostArchive;
    int noOfStoryArchive;
    int noOfAudioSaved;

    InstagramAccount(String username, String email, boolean isPublic, boolean isVerified, String countryOfOrigin,
                     int noOfPosts, int likes, int comments, String createdDate, int noOfImpressions,
                     int noOfFollowers, int noOfFollowing, int noOfHighlights,
                     int noOfPostArchive, int noOfStoryArchive, int noOfAudioSaved) {

        super(username, email, isPublic, isVerified, countryOfOrigin, noOfPosts, likes, comments,
              createdDate, noOfImpressions);

        this.noOfFollowers = noOfFollowers;
        this.noOfFollowing = noOfFollowing;
        this.noOfHighlights = noOfHighlights;
        this.noOfPostArchive = noOfPostArchive;
        this.noOfStoryArchive = noOfStoryArchive;
        this.noOfAudioSaved = noOfAudioSaved;
    }

    public String toString() {
        return "Platform: Instagram" +
               "\nUsername: " + username +
               "\nEmail: " + email +
               "\nPublic: " + isPublic +
               "\nVerified: " + isVerified +
               "\nCountry: " + countryOfOrigin +
               "\nPosts: " + noOfPosts +
               "\nLikes: " + likes +
               "\nComments: " + comments +
               "\nCreated: " + createdDate +
               "\nImpressions: " + noOfImpressions +
               "\nFollowers: " + noOfFollowers +
               "\nFollowing: " + noOfFollowing +
               "\nHighlights: " + noOfHighlights +
               "\nPost Archives: " + noOfPostArchive +
               "\nStory Archives: " + noOfStoryArchive +
               "\nAudio Saved: " + noOfAudioSaved;
    }
}

// Subclass 2 - YouTube Account
class YouTubeAccount extends SocialMediaAccount {

    int noOfSubscribers;
    double watchTime;
    boolean isMonetized;
    double estimatedRevenue;

    YouTubeAccount(String username, String email, boolean isPublic, boolean isVerified, String countryOfOrigin,
                   int noOfPosts, int likes, int comments, String createdDate, int noOfImpressions,
                   int noOfSubscribers, double watchTime, boolean isMonetized, double estimatedRevenue) {

        super(username, email, isPublic, isVerified, countryOfOrigin, noOfPosts, likes, comments, createdDate, noOfImpressions);

        this.noOfSubscribers = noOfSubscribers;
        this.watchTime = watchTime;
        this.isMonetized = isMonetized;
        this.estimatedRevenue = estimatedRevenue;
    }

    public String toString() {
        return "Platform: YouTube" +
               "\nUsername: " + username +
               "\nEmail: " + email +
               "\nPublic: " + isPublic +
               "\nVerified: " + isVerified +
               "\nCountry: " + countryOfOrigin +
               "\nPosts: " + noOfPosts +
               "\nLikes: " + likes +
               "\nComments: " + comments +
               "\nCreated: " + createdDate +
               "\nImpressions: " + noOfImpressions +
               "\nSubscribers: " + noOfSubscribers +
               "\nWatch Time: " + watchTime + " hrs" +
               "\nMonetized: " + isMonetized +
               "\nEstimated Revenue: $" + estimatedRevenue;
    }
}

// Subclass 3 - LinkedIn Account
class LinkedInAccount extends SocialMediaAccount {

    int noOfConnections;
    int noOfProfileViews;
    int noOfJobsApplied;

    LinkedInAccount(String username, String email, boolean isPublic, boolean isVerified, String countryOfOrigin,
                    int noOfPosts, int likes, int comments, String createdDate, int noOfImpressions,
                    int noOfConnections, int noOfProfileViews, int noOfJobsApplied) {

        super(username, email, isPublic, isVerified, countryOfOrigin,
              noOfPosts, likes, comments, createdDate, noOfImpressions);

        this.noOfConnections = noOfConnections;
        this.noOfProfileViews = noOfProfileViews;
        this.noOfJobsApplied = noOfJobsApplied;
    }

    public String toString() {
        return "Platform: LinkedIn" +
               "\nUsername: " + username +
               "\nEmail: " + email +
               "\nPublic: " + isPublic +
               "\nVerified: " + isVerified +
               "\nCountry: " + countryOfOrigin +
               "\nPosts: " + noOfPosts +
               "\nLikes: " + likes +
               "\nComments: " + comments +
               "\nCreated: " + createdDate +
               "\nImpressions: " + noOfImpressions +
               "\nConnections: " + noOfConnections +
               "\nProfile Views: " + noOfProfileViews +
               "\nJobs Applied: " + noOfJobsApplied;
    }
}

// Test class
class TestSocialMedia {
    public static void main(String[] args) {

        SocialMediaAccount ig = new InstagramAccount(
                "rutuj_insta", "rutuj@example.com", true, true, "India",
                250, 12000, 850, "2021-03-18", 550000,
                3000, 500, 12, 50, 100, 20
        );

        SocialMediaAccount yt = new YouTubeAccount(
                "RutujYT", "rutujyt@example.com", true, false, "India",
                180, 40000, 1200, "2020-07-12", 1000000,
                20000, 12500.5, true, 560.75
        );

        SocialMediaAccount li = new LinkedInAccount(
                "RutujLinkedIn", "rutujli@example.com", true, true, "India",
                35, 1200, 200, "2022-02-10", 50000,
                450, 1200, 5
        );

        System.out.println(ig + "\n--------------------------------------\n");
        System.out.println(yt + "\n--------------------------------------\n");
        System.out.println(li);
    }
}
