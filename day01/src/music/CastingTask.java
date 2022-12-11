package music;

// 음악재생 프로그램
// 부모는 Music 클래스
// 구현하지 않은 mode 메소드를 만들기

// 자식은 Ballad, HipHop, Rock 클래스

// Ballad 클래스
// mode 메소드를 오버라이딩 -> "발라드 모드" 출력
// onlyBallad 메소드 만들기 -> "onlyBallad 실행" 출력

// HipHop 클래스
//mode 메소드를 오버라이딩 -> "힙합 모드" 출력
//onlyHipHop 메소드 만들기 -> "onlyHipHop 실행" 출력

// Rock 클래스
//mode 메소드를 오버라이딩 -> "락 모드" 출력
//onlyRock 메소드 만들기 -> "onlyRock 실행" 출력


public class CastingTask {
	public static void main(String[] args) {
		CastingTask ct = new CastingTask();
		
		Music music1 = new HipHop();
		ct.check(music1);
		
		Ballad ballad = new Ballad();
		ct.check(ballad);
		
		ct.check(new Rock());
		
	}
	
	void check(Music music) {
		if(music instanceof Ballad) {
			Ballad ballad = (Ballad)music;
			ballad.mode();
			ballad.onlyBallad();
		}else if(music instanceof HipHop) {
			((HipHop)music).mode();
			((HipHop)music).onlyHipHop();
		}else if(music instanceof Rock) {
			((Rock)music).mode();
			((Rock)music).onlyRock();
		}
	}
}
