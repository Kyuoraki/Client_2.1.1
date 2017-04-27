package Model.DataBase.DataSets;

import Views.Protokol_Filter_View;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Андрей on 19.04.2017.
 */
public class Protocol
{
    private final String
            nomer,
            sotrudnik_Key,
            street;

    public Protocol(String nomer, String sotrudnik_Key, String street)
    {

        this.nomer = nomer;
        this.sotrudnik_Key = sotrudnik_Key;
        this.street = street;
    }

    public String getNomer() { return nomer; }

    public String getSotrudnik_Key() { return sotrudnik_Key; }

    public String getStreet() { return street; }

    @Override
    public String toString() { return nomer + " " + sotrudnik_Key + " " + street; }

    public static List<Protocol> filter(List<Protocol> allP rotocols, Protocol filter,
                                        List<Function<Protocol, String>> comparingFields)
    {
        return allProtocols.stream()
                .filter(protocol -> test(protocol, filter, comparingFields))
                .collect(Collectors.toList());
    }

    private static boolean test(Protocol protocol, Protocol filter,
                                List<Function<Protocol, String>> comparingFields)
    {
        return comparingFields.stream()
                .allMatch(func -> func.apply(protocol).contains(func.apply(filter)));
    }
}