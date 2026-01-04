package com.mycompany.tris;

public class Game {
    private boolean giocatore1=true;
    private boolean giocatore2=false;
    private char[][] griglia=new char[3][3];
    private int lastwinner=0;
    
    public Game(){
        creazioneGriglia();
    }
    public void creazioneGriglia(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                griglia[i][j]=' ';
            }
        }
        if(lastwinner==1) setGiocatori(true);
        else if(lastwinner==2) setGiocatori(false);
    }

    public void setGiocatori(boolean player) {
        if(player==true){
            this.giocatore1 = true;
            this.giocatore2 = false;
            lastwinner=1;
        }else{
            this.giocatore1 = false;
            this.giocatore2 = true;
            lastwinner=2;
        }
        
    }
    public boolean turno(int riga, int colonna){
        if(griglia[riga][colonna]!=' '){
            return false;
        }else if(giocatore1){
            griglia[riga][colonna]='X';
            giocatore1=false;
            giocatore2=true;
            return true;
        }else{
            griglia[riga][colonna]='O';
            giocatore1=true;
            giocatore2=false;
            return true;
        }
    }
    public char getIcona(int riga, int colonna){
        return griglia[riga][colonna];
    }
    public boolean controlloVittoria(char x){
        for(int i=0;i<3;i++){
            if(griglia[i][0]==x && griglia[i][1]==x && griglia[i][2]==x){
                return true;
            }else if(griglia[0][i]==x && griglia[1][i]==x && griglia[2][i]==x){
                return true;
            }
        }
        if(griglia[0][0]==x && griglia[1][1]==x && griglia[2][2]==x){
            return true;
        }else if(griglia[0][2]==x && griglia[1][1]==x && griglia[2][0]==x){
            return true;
        }else{
            return false;
        }
    }
    
}
