
        class StringOperations {
            public static void main(String[] args) {
                String str = "I study Basic Java!";
                // вывод последнего символа строки
                char lastChar = str.charAt(str.length() - 1);
                System.out.println("Последний символ строки: " + lastChar);

                // проверка содержания подстроки
                boolean containsJava = str.contains("Java");
                System.out.println("Строка содержит 'Java': " + containsJava);

                // замена символов
                String replacedStr = str.replace('a', 'o');
                System.out.println("Строка после замены символов: " + replacedStr);

                // преобразование к верхнему регистру
                String upperCaseStr = str.toUpperCase();
                System.out.println("Строка в верхнем регистре: " + upperCaseStr);

                // преобразование к нижнему регистру
                String lowerCaseStr = str.toLowerCase();
                System.out.println("Строка в нижнем регистре: " + lowerCaseStr);

                // вырезание подстроки
                String subStr = str.substring(0, str.indexOf("Java")) + str.substring(str.indexOf("Java") + "Java".length());
                System.out.println("Строка после вырезания подстроки 'Java': " + subStr);
            }
        }