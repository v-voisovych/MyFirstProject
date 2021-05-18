package training.my.storefront.controllers.pages;

import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("TaskSixController")
@Scope("tenant")
@RequestMapping("tasksix")
public class TaskSixController extends AccountPageController{
    private static final String TASK_SIX_CMS_PAGE = "task6CMSPage";

    @GetMapping("/")
    public String getTaskSixCmsPage(Model model) throws CMSItemNotFoundException {
        ContentPageModel contentPageModel = getContentPageForLabelOrId(TASK_SIX_CMS_PAGE);
        storeCmsPageInModel(model, contentPageModel);
        setUpMetaDataForContentPage(model,contentPageModel);
        return getViewForPage(model);
    }

}
