package Account;

public class Smartphone extends mobile implements Music_player,whatssapp{
    public void select_song() {
        System.out.println("Select song to play..");
    }
    public void next_song() {
        System.out.println("click here to play next song...");
    }
    public void previous_song() {System.out.println("Click here to previous song...");}
    public void forward_song() {System.out.println("click to forward song...");}
    public void send_Meassage() {System.out.println("Send meassage from whatssapp");}
    public void status() {System.out.println("we keep status and we see others status also");}
    public void recieve_meassage() {System.out.println("Recieve meassage from whatsapp");}
    public void voice_call() {System.out.println("We can call any one who r in our contacts..");}
    public void video_call() {System.out.println("We can do video call also in whatsapp...");}
    public static void main(String[] args) {
        Smartphone sp=new Smartphone();
        sp.call();      // this method from mobile class
        sp.select_song(); // from music player interface.
        sp.video_call();  // from whatsapp interface.
    }
}
