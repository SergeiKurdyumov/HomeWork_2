package HomeWork;

import java.util.logging.Logger;

public class Example {
    static Logger logger = Log.log(Example.class.getName());
    public static void main(String[] args) {
        String json = "[" +
                "{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}" +
                ",{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}" +
                "]";
        parseStringWithStandardLibrary(json);
    }


    private static void parseStringWithStandardLibrary(String json) {
        StringBuilder builder = new StringBuilder();
        String[] parts = json.split(",");
        for (String s : parts) {
            if (s.split(":") [0].trim().replaceAll("[\"{}\\[\\]]", "").equals("фамилия")) {
                builder.append("студент")
                    .append(s.replaceAll("[\"{}\\[\\]]", "")
                        .split(":")[1]);
            }

            if (s.split(":") [0].trim().replaceAll("[\"{}\\[\\]]", "").equals("оценка")) {
                builder.append("получил(а)")
                    .append(s.replaceAll("[\"{}\\[\\]]", "")
                        .split(":")[1]);
            }

            if (s.split(":") [0].trim().replaceAll("[\"{}\\[\\]]", "").equals("предмет")) {
                builder.append("по предмету")
                    .append(s.replaceAll("[\"{}\\[\\]]", "")
                        .split(":")[1]);
            }
        }
        System.out.println(builder);
    }
}