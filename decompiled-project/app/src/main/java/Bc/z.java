package Bc;

import java.util.Iterator;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.XMLEvent;

/* loaded from: classes2.dex */
public final class z implements i {

    /* renamed from: a, reason: collision with root package name */
    public XMLEventReader f2327a;

    /* renamed from: b, reason: collision with root package name */
    public h f2328b;

    public static void a(x xVar) {
        Iterator b2 = xVar.b();
        while (b2.hasNext()) {
            xVar.add(new w((Attribute) b2.next()));
        }
    }

    public final h b() {
        XMLEvent nextEvent = this.f2327a.nextEvent();
        if (nextEvent.isEndDocument()) {
            return null;
        }
        if (!nextEvent.isStartElement()) {
            return nextEvent.isCharacters() ? new y(nextEvent) : nextEvent.isEndElement() ? new r(1) : b();
        }
        x xVar = new x(nextEvent);
        if (xVar.isEmpty()) {
            a(xVar);
        }
        return xVar;
    }

    @Override // Bc.i
    public final h next() {
        h hVar = this.f2328b;
        if (hVar == null) {
            return b();
        }
        this.f2328b = null;
        return hVar;
    }

    @Override // Bc.i
    public final h peek() {
        if (this.f2328b == null) {
            this.f2328b = next();
        }
        return this.f2328b;
    }
}
