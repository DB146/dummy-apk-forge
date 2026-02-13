package Bc;

import javax.xml.stream.events.Characters;
import javax.xml.stream.events.XMLEvent;

/* loaded from: classes2.dex */
public final class y extends j {

    /* renamed from: a, reason: collision with root package name */
    public final Characters f2326a;

    public y(XMLEvent xMLEvent) {
        this.f2326a = xMLEvent.asCharacters();
    }

    @Override // Bc.j, Bc.h
    public final String getValue() {
        return this.f2326a.getData();
    }

    @Override // Bc.j, Bc.h
    public final boolean u() {
        return true;
    }
}
