public class Workspace {

    private static final String NAME = "Smruti Ranjan Nayak";
    private static final String ROLE = "Java and AI Developer";
    private static final String COLLEGE = "GIET University, B.Tech CSE";
    private static final String PROJECT = "DeepResearcher";

    private static final String[] SKILLS = {
        "Java", "Spring Boot", "Spring AI", "Hibernate",
        "PostgreSQL", "PgVector", "MySQL", "MongoDB",
        "RAG with Google Gemini",
        "n8n workflow automation",
        "Python", "OpenCV", "React.js"
    };

    public static void main(String[] args) {
        System.out.println("Hi, I'm " + NAME + ", " + ROLE + ".");
        System.out.println("Studying at " + COLLEGE);
        System.out.println("Currently building: " + PROJECT);
        for (String skill : SKILLS) {
            System.out.println("  * " + skill);
        }
    }
}
