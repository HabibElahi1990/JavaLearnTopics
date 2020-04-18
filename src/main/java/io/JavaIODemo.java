package io;

import java.io.*;
import java.text.MessageFormat;
import java.util.Arrays;

public class JavaIODemo {
    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("test.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i;
            while ((i = bufferedInputStream.read()) != (-1)) {
                System.out.print((char) i);
                if (i == 98)
                    bufferedInputStream.skip(2);
            }
            bufferedInputStream.close();
            fileInputStream.close();
            //Hab Elahi 1990

        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("\nplease enter anything ");
            String str = bf.readLine();//Hello
            System.out.println(str);//Hello
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file = new File("test1.txt");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            JavaIoObject person = new JavaIoObject();
            person.setFirstName("Habib");
            person.setLastName("Elahi");
            person.setAge(29);
            person.setGrade(100);
            objectOutputStream.writeBytes(person.toString());//JavaIoObject{firstName='Habib', lastName='Elahi', age=29, grade=100}
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("test1.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            byte[] strByte = objectInputStream.readAllBytes();
            System.out.println(new String(strByte));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            file = new File("text.txt");
            if (!file.exists()) {

                file.createNewFile();
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write("Hello Habib\n");
                fileWriter.write("your birth year is 1990");
                fileWriter.write(MessageFormat.format("\nI love {0}", "java"));

                fileWriter.close();


            } else {
                FileReader fileReader = new FileReader(file);
                while (fileReader.ready()) {
                    System.out.print((char) fileReader.read());
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Hello Habib
        //your birth year is 1990
        //I love java

        file=new File("/");
        if(file.isDirectory()){
            System.out.println(Arrays.toString(file.list(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.endsWith(".txt");
                }
            })));
            //[text.txt, textCopy.txt]

            System.out.println(Arrays.toString(file.listFiles()));
            //[\$RECYCLE.BIN, \git, \rep, \System Volume Information, \test, \text.txt, \textCopy.txt]
        }

    }
}
