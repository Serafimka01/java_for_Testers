import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupDeletionTest extends TestBase {

    @Test
    public void deleteGroupsTests() {
        openGroupsPage();
        if (!isGroupPresent()) {
            createGroup(new GroupData("GroupName", "GroupHeader", "GroupFooter"));
        }
        deleteGroup();
    }

}
