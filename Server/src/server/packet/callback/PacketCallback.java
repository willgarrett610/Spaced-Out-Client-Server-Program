package server.packet.callback;

public interface PacketCallback<T> {

	public void resultReceived(T result);
	
}
