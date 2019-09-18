package chapter_16_zerenlian.simple;

public abstract class Handler {

    private Handler nextHander;

    public final Response handleMessage(Request request){
        Response response = null;
        if (this.getHandlerLevel().equals(request.getRequestLevel())){
            response = this.echo(request);
        }else{
            if (this.nextHander != null){
                response = this.nextHander.handleMessage(request);
            }else{

            }
        }
        return response;
    }

    public void setNextHander(Handler hander){
        this.nextHander = hander;
    }

    protected abstract Level getHandlerLevel();

    protected abstract Response echo(Request request);

}
