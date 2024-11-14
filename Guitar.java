package InstrumentGuitarPiano;
public class Guitar extends Instrument {
    String output1;
    String output2;
    public Guitar(boolean musician, int volume, boolean track){
        super(musician, volume, track);
    }

    @Override
    public String play() {
        if (musician == true) {
            output1 = "Музыкант играет на гитаре";
        } else {
            output1 = "Гитара одиноко лежит в углу";
        }
        return output1;
    }

    @Override
    public String tune() {
        if (musician == true) {
            if (volume < 5) {
                if (track == true) {
                    output2 = "По комнате разносятся мелодичный звон струн достаточно тихо";
                } else {
                    output2 = "По комнате разносятся неизвестная мелодия достаточно тихо";
                }
            } else {
                if (track == true) {
                    output2 = "По комнате разносятся мелодичный звон струн достаточно громко";
                } else {
                    output2 = "По комнате разносятся неизвестная мелодия достаточно громко";
                }
            }
        } else {
            output2 = "Гитара без музыката не может извлечь звуки";
        }
        return output2;
    }
}
