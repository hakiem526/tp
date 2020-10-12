package seedu.address.model.util;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import seedu.address.model.AddressBook;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.expense.Amount;
import seedu.address.model.expense.Date;
import seedu.address.model.expense.Description;
import seedu.address.model.expense.Expense;
import seedu.address.model.expense.Remark;
import seedu.address.model.tag.Tag;

/**
 * Contains utility methods for populating {@code AddressBook} with sample data.
 */
public class SampleDataUtil {

    public static final Remark EMPTY_REMARK = new Remark("");

    public static Expense[] getSampleExpenses() {
        return new Expense[]{
            new Expense(new Description("Felicia's Birthday"), new Amount("140.00"), new Date("02-07-2020"),
                    new Remark("Birthday surprise with friends + birthday presents + birthday dinner"),
                    getTagSet("Girlfriend", "Shopping", "Food")),
            new Expense(new Description("Lunch with Hostel Mates"), new Amount("13"), new Date("01-07-2020"),
                    EMPTY_REMARK,
                    getTagSet("Food")),
            new Expense(new Description("Grab Home"), new Amount("15"), new Date("01-07-2020"),
                    new Remark("Need to stop grabbing so much!"),
                    getTagSet("Transport")),
            new Expense(new Description("ZARA Jacket"), new Amount("80"), new Date("30-06-2020"),
                    EMPTY_REMARK,
                    getTagSet("Shopping")),
            new Expense(new Description("Ramen with Tyler"), new Amount("18.50"), new Date("29-06-2020"),
                    new Remark("Tori King @ Tanjong Pagar"),
                    getTagSet("Food")),
            new Expense(new Description("Phone Bill Payment"), new Amount("35.90"), new Date("29-06-2020"),
                    EMPTY_REMARK,
                    getTagSet("Bills")),
            new Expense(new Description("Grab to Supper"), new Amount("5"), new Date("28-06-2020"),
                    EMPTY_REMARK,
                    getTagSet("Food")),
            new Expense(new Description("Movie with Felicia"), new Amount("14"), new Date("26-06-2020"),
                    new Remark("Tenet was so confusing..."),
                    getTagSet("Girlfriend")),
            new Expense(new Description("Top-up Ez-Link"), new Amount("20"), new Date("25-06-2020"),
                    EMPTY_REMARK,
                    getTagSet("Transport")),
            new Expense(new Description("Caifan"), new Amount("3.80"), new Date("25-06-2020"),
                    EMPTY_REMARK,
                    getTagSet("Food"))
        };
    }

    public static ReadOnlyAddressBook getSampleAddressBook() {
        AddressBook sampleAb = new AddressBook();
        for (Expense sampleExpense : getSampleExpenses()) {
            sampleAb.addExpense(sampleExpense);
        }
        return sampleAb;
    }

    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... strings) {
        return Arrays.stream(strings)
                .map(Tag::new)
                .collect(Collectors.toSet());
    }

}
