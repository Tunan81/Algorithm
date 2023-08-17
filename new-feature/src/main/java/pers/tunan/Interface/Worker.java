package pers.tunan.Interface;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/7/20
 */
public class Worker {

    /**
     * 使用匿名内部类创建回调对象
     */
    public static void main(String[] args) {
        Worker worker = new Worker();
        // 调用doWork方法，传入回调对象
        worker.doWork(new CallBack() {
            @Override
            public void onComplete(String result) {
                System.out.println("回调方法执行");
                System.out.println("回调结果：" + result);
            }
        });
    }

    /**
     * 回调方法
     * @param callBack 回调接口
     */
    public void doWork(CallBack callBack) {
        System.out.println("开始工作");
        // 模拟工作
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("工作完成");
        // 调用回调方法
        callBack.onComplete("工作完成");
    }

}
