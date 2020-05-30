package exVeiculo;

public class main {

	public static void main(String[] args) {
		
		CarroPasseio  carroPasseio = new CarroPasseio();
		
		carroPasseio.EntrVeic(500, 220, 10000);
		carroPasseio.EntrPass("Preto", "Hatch");
		
		carroPasseio.MostrVeic();
		carroPasseio.MostrPass();
		
		Caminhao caminhao = new Caminhao();
		
		caminhao.EntrVeic(10000, 150, 100000);
		caminhao.EntrCam(10, 13, 25);
		
		caminhao.MostrVeic();
		caminhao.MostrCam();

	}

}
