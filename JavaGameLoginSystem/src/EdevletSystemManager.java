public class EdevletSystemManager implements EdevletSystem {
    @Override
    public void logAdd(String message) {
        System.out.println("E devlet bilgileri doğrulandı");
    }

    @Override
    public void logUptade(String message) {
        System.out.println("E devlet bilgileri güncellendi.");
    }

    @Override
    public void logDelete(String message) {
        System.out.println("E devlet bilgileri doğrulandı ve kullanıcı silindi");
    }


}