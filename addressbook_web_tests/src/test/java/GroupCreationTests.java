import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testCreateGroup() {
        openGroupsPage();
        createGroup(new GroupData("GroupName", "GroupHeader", "GroupFooter"));
    }

    @Test
    public void testCreateGroupWithEmptyName() {
        openGroupsPage();
        createGroup(new GroupData());
    }

    @Test
    public void testCreateGroupWithNameOnly() {
        openGroupsPage();
        createGroup(new GroupData().withName("some name"));
    }
}
