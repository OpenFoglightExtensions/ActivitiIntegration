package de.leikasoft.tst;

import org.activiti.engine.*;
import org.activiti.engine.repository.DeploymentBuilder;
import org.activiti.engine.runtime.ProcessInstance;

import java.util.HashMap;
import java.util.Map;


/**
 * Created with IntelliJ IDEA.
 * User: stefan
 * Date: 24.05.13
 * Time: 10:59
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main (String [] args) {
        System.out.println("STARTED");
        ProcessEngine processEngine = ProcessEngineConfiguration.createStandaloneInMemProcessEngineConfiguration()
                .setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE)
                .setJdbcUrl("jdbc:h2:mem:my-own-db;DB_CLOSE_DELAY=1000")
                .setJobExecutorActivate(true)
                .buildProcessEngine();

        System.out.println("Process Engine Loaded. "+processEngine);




        RepositoryService repositoryService = processEngine.getRepositoryService();
        DeploymentBuilder deplo = repositoryService.createDeployment()
                .addClasspathResource("de/leikasoft/tst/VacationRequest.bpmn20.xml");
               
        deplo.deploy();

        System.out.println("Number of process definitions: " + repositoryService.createProcessDefinitionQuery().count());
        if (2==2)return;


        Map<String, Object> variables = new HashMap<String, Object>();
        variables.put("employeeName", "Kermit");
        variables.put("numberOfDays", new Integer(4));
        variables.put("vacationMotivation", "I'm really tired!");

        RuntimeService runtimeService = processEngine.getRuntimeService();
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("vacationRequest", variables);


        int x = 0;
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }

            x++;
            System.out.print(".");
            if (x%5 == 0) {
                System.out.println(">");
                System.out.println("Number of process definitions: " + repositoryService.createProcessDefinitionQuery().count());

            }
        }
//
    }
}
