package InstrumentGuitarPiano;
public class Piano extends Instrument {
    String output1;
    String output2;
    public Piano(boolean musician, int volume, boolean track){
        super(musician, volume, track);
    }

    @Override
    public String play() {
        if (musician == true) {
            output1 = "Музыкант играет на пианино";
        } else {
            output1 = "Пианино одиноко стоит посреди пустой комнаты";
        }
        return output1;
    }

    @Override
    public String tune() {
        if (musician == true) {
            if (volume < 5) {
                if (track == true) {
                    output2 = "По комнате разносятся мелодия знаменитой компазиции достаточно тихо";
                } else {
                    output2 = "По комнате разносятся неизвестная мелодия достаточно тихо";
                }
            } else {
                if (track == true) {
                    output2 = "По комнате разносятся мелодия знаменитой компазиции достаточно громко";
                } else {
                    output2 = "По комнате разносятся неизвестная мелодия достаточно громко";
                }
            }
        } else {
            output2 = "Пианино без музыката не может извлечь мелодию";
        }
        return output2;
    }
}

