package rmit.ai.clima.planinstanceinfo;

import aos.jack.jak.plan.PlanInstanceInfo;


public class ActType extends PlanInstanceInfo
     {
         public int id;
         public String description;

         public ActType(int i)
         {
             super(5);          // 5 is the default precedence
             id = i;
         }

         public ActType(int i, String desc)
         {
             super(5);          // 5 is the default precedence
             id = i;
             description = desc;
         }
         
 }