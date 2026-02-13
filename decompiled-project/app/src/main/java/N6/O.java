package N6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class O implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public static final O f7244a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ O[] f7245b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, N6.O] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f7244a = r02;
        f7245b = new O[]{r02};
    }

    public static O valueOf(String str) {
        return (O) Enum.valueOf(O.class, str);
    }

    public static O[] values() {
        return (O[]) f7245b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Q5.e.p("no calls to next() since the last call to remove()", false);
    }
}
