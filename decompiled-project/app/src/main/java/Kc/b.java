package Kc;

import Eb.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import jb.InterfaceC1394e;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class b implements InterfaceC1394e {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6221a = new Object();

    @Override // jb.InterfaceC1394e
    public Object apply(Object obj) {
        List entities = (List) obj;
        l.e(entities, "entities");
        if (entities.isEmpty()) {
            throw new NoSuchElementException("No banner ads in cache");
        }
        ArrayList arrayList = new ArrayList(p.S(entities, 10));
        for (Iterator it = entities.iterator(); it.hasNext(); it = it) {
            Ic.b bVar = (Ic.b) it.next();
            arrayList.add(new Jc.a(bVar.f5358a, bVar.f5359b, bVar.f5360c, bVar.f5361d, bVar.f5362e, bVar.f5363f, bVar.g, bVar.f5364h, bVar.f5365i, bVar.j, bVar.k, bVar.f5366l, bVar.f5367m, bVar.f5368n, bVar.f5369o, bVar.f5370p, bVar.f5371q));
        }
        return arrayList;
    }
}
