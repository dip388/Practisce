import java.util.*;

public class ExpertCatlog {
    HashMap<String,String> catlog=new LinkedHashMap<>();

    public void addExpert(String expDetails)
    {
        if(expDetails.isEmpty())
        {
            return;
        }
        String s[]=expDetails.split(":");
        String expname=s[0].trim();
        String topic=s[1].trim();
        catlog.put(expname,topic);

    }

    public Set<String> getExpertByTopic(String topic)
    {
        Set<String> res=new HashSet<>();
        for(Map.Entry<String,String> entry:catlog.entrySet())
                {
                    if(entry.getValue().equalsIgnoreCase(topic))
                    {
                        res.add(entry.getKey());
                    }
                }
        return res;
    }
}
