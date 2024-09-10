package mattiasusin.D2S2U5.services;

import mattiasusin.D2S2U5.entities.Autore;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class AutoreService {
    private List<Autore> autoreList = new ArrayList<>();

    public List<Autore> findAll() {
        return this.autoreList;
    }

    // 2. findById
    public Autore findById(int autoreId) throws ClassNotFoundException {
        Autore found = null;
        for (Autore autore : this.autoreList) {
            if (autore.getId() == autoreId) found = autore;
        }
        if (found == null) throw new ClassNotFoundException();
        return found;

    }

    // 3. SALVA
    public Autore saveAutore(Autore body) {
        Random rd = new Random();
        body.setId(rd.nextInt(1, 10));
        body.setEmail(rd.toString());
        body.setAvatar(rd.toString());
        body.setDataDiNascita(rd.nextInt());
        this.autoreList.add(body);
        return body;
    }
}
