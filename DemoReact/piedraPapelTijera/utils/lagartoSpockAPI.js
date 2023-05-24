import { jugadas } from "./jugadas";

export const jugadorMaquina = (jugador1) => {
  const numero = Math.floor(Math.random() * Object.keys(jugadas).length);
  const maquina = Object.keys(jugadas)[numero];
  return jugar(jugador1, jugadas[maquina]);
};

function jugar(jugador1, jugador2) {
  console.log("JUGADOR1: " + jugador1 + " - JUGADOR2: " + jugador2);
  if (jugador1 === jugador2) {
    return "EMPATE \n" + jugador1 + "-" + jugador2;
  }

  switch (jugador1) {
    case jugadas.PIEDRA:
      if (jugador2 === jugadas.LAGARTO || jugador2 === jugadas.TIJERA) {
        return getVictoria(jugador1, jugador2);
      }
      break;
    case jugadas.PAPEL:
      if (jugador2 === jugadas.SPOCK || jugador2 === jugadas.PIEDRA) {
        return getVictoria(jugador1, jugador2);
      }
      break;
    case jugadas.TIJERA:
      if (jugador2 === jugadas.PAPEL || jugador2 === jugadas.LAGARTO) {
        return getVictoria(jugador1, jugador2);
      }
      break;
    case jugadas.LAGARTO:
      if (jugador2 === jugadas.SPOCK || jugador2 === jugadas.PAPEL) {
        return getVictoria(jugador1, jugador2);
      }
      break;
    case jugadas.SPOCK:
      if (jugador2 === jugadas.TIJERA || jugador2 === jugadas.PIEDRA) {
        return getVictoria(jugador1, jugador2);
      }
      break;
  }

  return "PIERDE JUGADOR 1 \n" + jugador1 + " PIERDE CONTRA " + jugador2;
}

function getVictoria(jugador1, jugador2) {
  return "GANA JUGADOR 1 \n" + jugador1 + " GANA A " + jugador2;
}
