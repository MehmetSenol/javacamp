package kodlamaio.hrms.core.utilities;

public class ErrorDataResult<T> extends DataResult<T>{
    public ErrorDataResult(T data){
        super(false,data);
    }
    public ErrorDataResult(T data,String message){
        super(data,false,message);
    }
    public ErrorDataResult(String message){
        super(null,false,message);
    }
    public ErrorDataResult(){
        super(false,null);
    }
}
