import java.util.*;

    class QuizSystem {
        private static Scanner sc = new Scanner(System.in);
        private static HashMap<String, String> questions = new HashMap<>();
        private static int score = 0;

        // METHOD TO ADD A QUESTIONS & ANSWERS

        public static void addQuestions() {
            questions.put("WHAT IS THE CAPITAL OF INDIA", "NEW DELHI");
            questions.put("WHAT IS THE MOST INDIVIDUAL HEIGHEST ODI SCORE", "264");
            questions.put("WHO IS THE AUTHOR OF HELMET", "SHAKESPEARE");
            questions.put("WHICH IS THE LARGEST PLANET IN OUR SOLAR SYSTEM", "JUPITAR");
            questions.put("WHAT IS THE CHEMICAL SYMBOL OF WATER", "H2O");
        }

        // MWTHOD TO START THE QUIZE

        public static void startQuiz() {
            System.out.println("WELCOME TO QUIZ");
            System.out.println("YOU WILL BE ASKED 5 QUESTIONS. TYPE YOUR ANSWER AND PRESS ENTER");

            for (String question : questions.keySet()) {
                System.out.println("\n" + question);
                String answer = sc.nextLine();
                if (answer.equalsIgnoreCase(questions.get(question))) {
                    score++;
                }
            }
        }

        // METHOD TO DISPLAY RESULT

        public static void displayResult() {
            System.out.println("\nQUIZ OVER! YOUR SCORE :" + score + "/" + questions.size());
            if (score == questions.size()) {
                System.out.println("EXCELLENT! FULL MARKS!");
            } else if (score >= 3) {
                System.out.println("GOOD JOB ! YOU DID WELL");
            } else {
                System.out.println("KEEP PRACTICEING! YOU CAN DO BETTER");
            }
        }

        public static void main(String[] args) {
            addQuestions();
            startQuiz();
            displayResult();
        }
    }
