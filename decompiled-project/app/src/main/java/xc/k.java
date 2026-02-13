package xc;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class k extends ArrayList {
    public boolean b() {
        return size() < 0;
    }

    public int i() {
        return ((ArrayList) this).modCount;
    }
}
