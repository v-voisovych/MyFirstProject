package training.my.my_cronjob;

import de.hybris.cronjobtutorial.model.CurrentNumberUsersCronJobModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import training.my.service.impl.MyUserServiceImpl;

import javax.annotation.Resource;
import java.util.logging.Logger;

public class CurrentNumberUsersJob extends AbstractJobPerformable<CurrentNumberUsersCronJobModel> {

    private static final Logger LOGGER = Logger.getLogger(CurrentNumberUsersJob.class.getName());

    @Resource
    MyUserServiceImpl myUserService;

    @Override
    public PerformResult perform(CurrentNumberUsersCronJobModel currentNumberUsersCronJobModel) {
        LOGGER.info("**************************************");
        LOGGER.info("Current number of users: " + myUserService.currentNumberUsers() + ".");
        LOGGER.info("**************************************");
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
}
