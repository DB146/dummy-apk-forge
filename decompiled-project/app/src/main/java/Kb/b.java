package Kb;

import Eb.AbstractC0255f;
import Eb.n;
import X.c;
import java.io.Serializable;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class b extends AbstractC0255f implements a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Enum[] f6218a;

    public b(Enum[] entries) {
        l.e(entries, "entries");
        this.f6218a = entries;
    }

    @Override // Eb.AbstractC0250a
    public final int b() {
        return this.f6218a.length;
    }

    @Override // Eb.AbstractC0250a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        l.e(element, "element");
        return ((Enum) n.Z(element.ordinal(), this.f6218a)) == element;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Enum[] enumArr = this.f6218a;
        int length = enumArr.length;
        if (i7 < 0 || i7 >= length) {
            throw new IndexOutOfBoundsException(c.e(i7, length, "index: ", ", size: "));
        }
        return enumArr[i7];
    }

    @Override // Eb.AbstractC0255f, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        l.e(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) n.Z(ordinal, this.f6218a)) == element) {
            return ordinal;
        }
        return -1;
    }

    @Override // Eb.AbstractC0255f, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        l.e(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) n.Z(ordinal, this.f6218a)) == element) {
            return ordinal;
        }
        return -1;
    }
}
