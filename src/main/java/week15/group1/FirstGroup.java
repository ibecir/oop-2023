package week15.group1;

import java.io.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface WritableFieldFirstGroup{

}

class UnableToCastException extends RuntimeException {
    public UnableToCastException(String message) {
        super(message);
    }

    public UnableToCastException(String message, Throwable cause) {
        super(message, cause);
    }
}

class Book {
    @WritableFieldFirstGroup
    private Date date;
    private String quarter;
    private int quantity;
    private int year;
    @WritableFieldFirstGroup
    private String customerId;
    @WritableFieldFirstGroup
    private Double totalAmount;
    private Double profitPercentage;
    private Double profitIncrease;
    private Double costPrice;

    public Book(BookBuilder builder) {
        this.date = builder.date;
        this.quarter = builder.quarter;
        this.quantity = builder.quantity;
        this.year = builder.year;
        this.customerId = builder.customerId;
        this.totalAmount = builder.totalAmount;
        this.profitPercentage = builder.profitPercentage;
        this.profitIncrease = builder.profitIncrease;
        this.costPrice = builder.costPrice;
    }

    public Date getDate() {
        return date;
    }

    public String getQuarter() {
        return quarter;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getYear() {
        return year;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public Double getProfitPercentage() {
        return profitPercentage;
    }

    public Double getProfitIncrease() {
        return profitIncrease;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public static class BookBuilder {
        private Date date;
        private String quarter;
        private int quantity;
        private int year;
        private String customerId;
        private Double totalAmount;
        private Double profitPercentage;
        private Double profitIncrease;
        private Double costPrice;

        public BookBuilder() {
        }

        public BookBuilder setDate(Date date) {
            this.date = date;
            return this;
        }

        public BookBuilder setQuarter(String quarter) {
            this.quarter = quarter;
            return this;
        }

        public BookBuilder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public BookBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public BookBuilder setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public BookBuilder setTotalAmount(Double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public BookBuilder setProfitPercentage(Double profitPercentage) {
            this.profitPercentage = profitPercentage;
            return this;
        }

        public BookBuilder setProfitIncrease(Double profitIncrease) {
            this.profitIncrease = profitIncrease;
            return this;
        }

        public BookBuilder setCostPrice(Double costPrice) {
            this.costPrice = costPrice;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}

class FirstGroup {
    private List<Book> books;

    public FirstGroup(String filename) {
        this.books = loadBooks(filename);
        for (Book book : this.books){
            System.out.println(book.getCustomerId() + " - " + book.getDate().toString());
        }
    }

    private static List<Book> loadBooks(String filename) {
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(filename)
            );
            List<String> lines = reader.lines().collect(Collectors.toList());
            List<Book> books = new ArrayList<>();
            for(int i = 1; i < lines.size(); i++){
                String[] tempLine = lines.get(i).split(";");
                if(tempLine[0] == "" || tempLine[1] == "" || tempLine[2] == "")
                    throw new UnableToCastException("The values must not be empty");

                books.add(
                        new Book.BookBuilder()
                                .setDate(new SimpleDateFormat("MM/dd/yyyy").parse(tempLine[0]))
                                .setQuarter(tempLine[1])
                                .setQuantity(Integer.parseInt(tempLine[2]))
                                .setYear(Integer.parseInt(tempLine[3]))
                                .setCustomerId(tempLine[4])
                                .setTotalAmount(Double.parseDouble(tempLine[5]))
                                .setProfitPercentage(Double.parseDouble(tempLine[6]))
                                .setProfitIncrease(Double.parseDouble(tempLine[7]))
                                .setCostPrice(Double.parseDouble(tempLine[8]))
                                .build()
                );
            }
            return books;
        } catch (FileNotFoundException | ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Book> getBooks() {
        return this.books;
    }
}

class CustomReportGenerator {
    public static void writeReport(String outputFileName, List<Book> books){
        Class<?> claz = Book.class;
        Field[] fields = claz.getDeclaredFields();
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
            for(Book book : books){
                String tempLine = "";
                for (Field field : fields){
                    if(field.isAnnotationPresent(WritableFieldFirstGroup.class)){
                        field.setAccessible(true);
                        tempLine = tempLine.concat(field.get(book).toString()).concat(",");
                    }
                }
                writer.write(tempLine.substring(0, tempLine.length() - 1).concat("\n"));
            }
            writer.close();
        } catch (IOException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}

// TODO tests for this program

class RunMain {
    public static void main(String[] args) {
        FirstGroup firstGroup = new FirstGroup("books.csv");
        CustomReportGenerator.writeReport("first-group-output.csv", firstGroup.getBooks());
    }
}

