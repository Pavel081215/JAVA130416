package ånterprise.generics;
import ånterprise.generics.TaskGenerics.Task;

/**
 * Created by Pavel on 20.03.2016.
 */
public  class LongTask implements Task<Long> {
    Long result;

    public LongTask(long result) {

        this.result = result;
    }


    @Override
    public void execute() {
        result = result + 1L;

    }

    @Override
    public Long getResult() {
        if (result < 1L) {
            return 0L;
        }
        return result;
    }
}
