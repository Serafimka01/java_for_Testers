import org.junit.jupiter.api.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testCreateGroup() {
        openGroupsPage();
        createGroup("GroupName", "GroupHeader", "GroupFooter");
    }

    @Test
    public void testCreateGroupWithEmptyName() {
        openGroupsPage();
        createGroup("", "", "");
    }
}
