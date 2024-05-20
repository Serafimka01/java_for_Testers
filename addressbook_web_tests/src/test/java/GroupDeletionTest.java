import org.junit.jupiter.api.Test;

public class GroupDeletionTest extends TestBase {

    @Test
    public void deleteGroupsTests() {
        openGroupsPage();
        if (!isGroupPresent()) {
            createGroup("GroupName", "GroupHeader", "GroupFooter");
        }
        deleteGroup();
    }

}
