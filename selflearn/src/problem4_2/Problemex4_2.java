package problem4_2;

public class Problemex4_2 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        AlarmClock ac = new AlarmClock();
        funcAlarm(ac);
        funcClock(ac);//  アラーム付き時計クラスのインスタンスを生成
    }

    //  アラームとしての処理
    public static void funcAlarm(IAlarm alarm) {
        IAlarm ac = (IAlarm) alarm;
        ac.setAlarm(); //  アラームのセット
        ac.alarm(); //  アラームを鳴らす
        alarm.stopAlarm(); //  アラームを止める
    }

    //  時計としての処理
    public static void funcClock(IClock clock) {
        IClock ac = (IClock) clock;
        ac.adjustTime(); //  時間を調整する
        ac.showTime(); //  時間を表示する
    }

}
