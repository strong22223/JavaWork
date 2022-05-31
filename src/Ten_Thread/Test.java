//public class TalkSend implements Runnable{
//    DatagramSocket socket = null;
//    BufferedReader reader = null;
//
//    private int fromPort;
//    private String toIp;
//    private int toPort;
//    public TalkSend(int fromPort, String toIp, int toPort) {
//        this.fromPort = fromPort;
//        this.toIp = toIp;
//        this.toPort = toPort;
//
//        try {
//            socket = new DatagramSocket(fromPort);
//            reader = new BufferedReader(new InputStreamReader(System.in));
//        } catch (SocketException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void run() {
//        while (true){
//            try {
//                String data = reader.readLine();
//                byte[] datas = data.getBytes();
//                DatagramPacket packet = new DatagramPacket(datas,0,datas.length,new InetSocketAddress(this.toIp,this.toPort));
//                socket.send(packet);
//                if (data.equals("bye")){
//                    break;
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        socket.close();
//
//    }
//}
//
//public class TalkReceive implements Runnable{
//    DatagramSocket socket = null;
//    private int port;
//    private String msgFrom;
//
//    public TalkReceive(int port,String msgFrom) {
//        this.port = port;
//        this.msgFrom = msgFrom;
//        try {
//            socket = new DatagramSocket(port);
//        } catch (SocketException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void run() {
//        // 准备接收包裹
//        while (true){
//            try {
//                byte[] container = new byte[1024];
//                DatagramPacket packet = new DatagramPacket(container, 0, container.length);
//                socket.receive(packet); // 阻塞式接收包裹
//                // 断开连接
//                byte[] data = packet.getData();
//                String receiveData = new String(data,0,data.length);
//                System.out.println(msgFrom+":"+receiveData);
//                if (receiveData.equals("bye")){
//                    break;
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        socket.close();
//    }
//}
//
//public class TalkStudent {
//    public static void main(String[] args) {
//        // 开启两个线程
//        new Thread(new TalkSend(7777,"127.0.0.1",9999)).start();
//        new Thread(new TalkReceive(8888,"老师")).start();
//    }
//}
//
//public class TalkTeacher {
//    public static void main(String[] args) {
//        // 开启两个线程
//        new Thread(new TalkSend(5555,"127.0.0.1",8888)).start();
//        new Thread(new TalkReceive(9999,"学生")).start();
//    }
//}
