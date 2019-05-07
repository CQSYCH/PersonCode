package tk.mybatis.web.entityModel;
import java.io.Serializable;

public class ActionResult implements Serializable {
    public ActionResult(){
        super();
    }
    public ActionResult(int code,String msg,Object data){
        this.code=code;
        this.msg=msg;
        this.data=data;
    }
    public int code;
    public String msg;
    public Object data;
}
