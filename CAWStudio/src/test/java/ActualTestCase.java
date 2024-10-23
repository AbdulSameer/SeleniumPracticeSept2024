import org.testng.annotations.Test;

public class ActualTestCase extends Base {
    ActionsClass actionsClass;

    @Test
    public void expandingTable() throws InterruptedException {
        actionsClass = new ActionsClass(Base.driver);
        actionsClass.enterData();
        Thread.sleep(2000);
        actionsClass.copyPasteData();
        Thread.sleep(2000);
        actionsClass.refreshDataTable();
        Thread.sleep(2000);
        actionsClass.assertingData();
    }
}
