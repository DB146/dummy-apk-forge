package okhttp3;

import java.io.IOException;

/* loaded from: classes2.dex */
public interface Callback {
    void g(Call call, Response response);

    void i(Call call, IOException iOException);
}
