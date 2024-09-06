package year2023.week15.group1;

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

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface WritableField {
}

class InvalidCastException extends RuntimeException {
    public InvalidCastException(String message) {
        super(message);
    }

    public InvalidCastException(String message, Throwable cause) {
        super(message, cause);
    }
}

class Item {
    @WritableField
    private Date date;
    private String quarter;
    private int quantity;
    private int year;
    @WritableField
    private String customerId;
    @WritableField
    private Double totalAmount;
    private Double profitPct;
    private Double profitInr;
    private Double costPrice;

    public Item(ItemBuilder builder) {
        this.date = builder.date;
        this.quarter = builder.quarter;
        this.quantity = builder.quantity;
        this.year = builder.year;
        this.customerId = builder.customerId;
        this.totalAmount = builder.totalAmount;
        this.profitPct = builder.profitPct;
        this.profitInr = builder.profitInr;
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

    public Double getProfitPct() {
        return profitPct;
    }

    public Double getProfitInr() {
        return profitInr;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public static class ItemBuilder {
        private Date date;
        private String quarter;
        private int quantity;
        private int year;
        private String customerId;
        private Double totalAmount;
        private Double profitPct;
        private Double profitInr;
        private Double costPrice;

        public ItemBuilder() {
        }

        public ItemBuilder setDate(Date date) {
            this.date = date;
            return this;
        }

        public ItemBuilder setQuarter(String quarter) {
            this.quarter = quarter;
            return this;
        }

        public ItemBuilder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public ItemBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public ItemBuilder setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public ItemBuilder setTotalAmount(Double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public ItemBuilder setProfitPct(Double profitPct) {
            this.profitPct = profitPct;
            return this;
        }

        public ItemBuilder setProfitInr(Double profitInr) {
            this.profitInr = profitInr;
            return this;
        }

        public ItemBuilder setCostPrice(Double costPrice) {
            this.costPrice = costPrice;
            return this;
        }

        public Item build() {
            return new Item(this);
        }
    }
}

public class FinalPrep {
    private List<Item> items;

    public FinalPrep(String fileName) {
        try {
            items = loadItems(fileName);

            for (Item item : items) {
                System.out.println(item.getDate());
            }
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Item> loadItems(String fileName) throws IOException, ParseException {
        List<Item> items = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        List<String> lines = bufferedReader.lines().collect(Collectors.toList());
        for (int i = 1; i < lines.size(); i++) {
            String line = lines.get(i);
            String[] parsedLine = line.split(";");
            if (parsedLine[0] == "" || parsedLine[1] == "" || parsedLine[0] == "") {
                throw new InvalidCastException("There are empty fields in the list");
            }
            Item tmpItem = new Item.ItemBuilder().setDate(new SimpleDateFormat("MM/dd/yyyy").parse(parsedLine[0])).setQuarter(parsedLine[1]).setQuantity(Integer.parseInt(parsedLine[2])).setYear(Integer.parseInt(parsedLine[3])).setCustomerId(parsedLine[4]).setTotalAmount(Double.parseDouble(parsedLine[5])).setProfitPct(Double.parseDouble(parsedLine[6])).setProfitInr(Double.parseDouble(parsedLine[7])).setCostPrice(Double.parseDouble(parsedLine[8])).build();

            items.add(tmpItem);
        }
        bufferedReader.close();
        return items;
    }

    public static void generateReport() {

    }

    public List<Item> getItems() {
        return this.items;
    }
}

class ReportWriter {
    public static void writeReport(String reportOutputFile, List<Item> items) {
        try {
            //PrintWriter writer = new PrintWriter(new FileWriter(reportOutputFile, true));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(reportOutputFile));

            Class clazz = Item.class;
            Field[] fields = clazz.getDeclaredFields();

            for (Item item : items) {
                String temp = "";
                for (Field field : fields) {
                    if (field.isAnnotationPresent(WritableField.class)) {
                        field.setAccessible(true);
                        String fieldValue = field.get(item).toString();
                        temp = temp + fieldValue + ",";
                    }
                }
                //writer.println(temp.substring(0, temp.length() - 1));
                bufferedWriter.write(temp.substring(0, temp.length() - 1) + "\n");
            }
            bufferedWriter.close();
        } catch (IOException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}

class MainRun {
    public static void main(String[] args) {
        FinalPrep prep = new FinalPrep("books.csv");
        ReportWriter.writeReport("books-report.csv", prep.getItems());
    }
}
