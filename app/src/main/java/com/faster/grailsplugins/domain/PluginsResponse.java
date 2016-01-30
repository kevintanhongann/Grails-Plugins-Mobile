package com.faster.grailsplugins.domain;

/**
 * Created by kevintan on 28/01/2016.
 */
public class PluginsResponse {
    @SerializedName("attribute_names")
    @Expose
    private List<Object> attributeNames = new ArrayList<Object>();
    @SerializedName("attributes")
    @Expose
    private List<Object> attributes = new ArrayList<Object>();
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("custom_licenses")
    @Expose
    private List<Object> customLicenses = new ArrayList<Object>();
    @SerializedName("desc")
    @Expose
    private String desc;
    @SerializedName("followers_count")
    @Expose
    private Integer followersCount;
    @SerializedName("githubRepo")
    @Expose
    private GithubRepo githubRepo;
    @SerializedName("issue_tracker_url")
    @Expose
    private String issueTrackerUrl;
    @SerializedName("labels")
    @Expose
    private List<Object> labels = new ArrayList<Object>();
    @SerializedName("latest_version")
    @Expose
    private String latestVersion;
    @SerializedName("licenses")
    @Expose
    private List<String> licenses = new ArrayList<String>();
    @SerializedName("linked_to_repos")
    @Expose
    private List<String> linkedToRepos = new ArrayList<String>();
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("owner")
    @Expose
    private String owner;
    @SerializedName("permissions")
    @Expose
    private List<Object> permissions = new ArrayList<Object>();
    @SerializedName("rating_count")
    @Expose
    private Integer ratingCount;
    @SerializedName("repo")
    @Expose
    private String repo;
    @SerializedName("system_ids")
    @Expose
    private List<String> systemIds = new ArrayList<String>();
    @SerializedName("updated")
    @Expose
    private String updated;
    @SerializedName("vcs_url")
    @Expose
    private String vcsUrl;
    @SerializedName("versions")
    @Expose
    private List<String> versions = new ArrayList<String>();
    @SerializedName("website_url")
    @Expose
    private String websiteUrl;






    public class GithubRepo {
        @SerializedName("full_name")
        @Expose
        private String fullName;
        @SerializedName("html_url")
        @Expose
        private String htmlUrl;
        @SerializedName("forks_count")
        @Expose
        private Integer forksCount;
        @SerializedName("stargazers_count")
        @Expose
        private Integer stargazersCount;
        @SerializedName("watchers_count")
        @Expose
        private Integer watchersCount;

    }
}
