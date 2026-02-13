package U2;

import V2.j;
import android.content.ContentValues;
import android.database.Cursor;
import java.io.Closeable;

/* loaded from: classes.dex */
public interface a extends Closeable {
    void B(Object[] objArr);

    void C();

    void D();

    int M(ContentValues contentValues, Object[] objArr);

    void h();

    void i();

    boolean isOpen();

    void o(String str);

    j q(String str);

    void r();

    boolean u();

    Cursor v(f fVar);

    boolean z();
}
