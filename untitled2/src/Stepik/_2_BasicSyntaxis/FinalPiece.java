package Stepik._2_BasicSyntaxis;


import java.util.stream.IntStream;

import static java.util.stream.IntStream.*;

public class FinalPiece {
    public static void main(String[] args) {
        String[] roles = new String[]{ "Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич" };
        String[] textLines = new String[]{
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.", "Аммос Федорович: Как ревизор?", "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!",
                "Городничий: Господа, сообщаю вам пренеприятное известие, его поведал мне Артемий Филиппович: к нам едет ревизор."
        };
        /*
        создаем объект stringBuilder sb, выбираем из массива имена ролей, по условию добавить ":" и перевод на следующую строку
        если текст начинается с имя + ":" , то присваиваем номер роли + ") " + замена ИМЯ + ":" на "" и перевод на новую строку
        после вложенного цикла перевод строки
        return sb.toString()
         */

        StringBuilder sb = new StringBuilder();
        OUTER:
        for (String role : roles) {
            sb.append(role);
            sb.append(":");
            sb.append("\n");
            INNER:
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(role + ":")) {
                    sb.append(j + 1);
                    sb.append(") ");
                    sb.append(textLines[j].replaceFirst(role + ": ", ""));
                    sb.append("\n");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
            }
}














