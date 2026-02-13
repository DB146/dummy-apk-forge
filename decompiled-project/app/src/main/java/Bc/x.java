package Bc;

import java.util.Iterator;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

/* loaded from: classes2.dex */
public final class x extends g {

    /* renamed from: a, reason: collision with root package name */
    public final StartElement f2325a;

    public x(XMLEvent xMLEvent) {
        this.f2325a = xMLEvent.asStartElement();
        xMLEvent.getLocation();
    }

    public final Iterator b() {
        return this.f2325a.getAttributes();
    }

    @Override // Bc.h
    public final String getName() {
        return this.f2325a.getName().getLocalPart();
    }
}
