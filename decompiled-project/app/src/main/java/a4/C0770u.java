package a4;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* renamed from: a4.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0770u {

    /* renamed from: a, reason: collision with root package name */
    public final long f12687a;

    public C0770u(long j) {
        this.f12687a = j;
    }

    public static C0770u a(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? new C0770u(Long.parseLong(jsonReader.nextString())) : new C0770u(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0770u) {
            return this.f12687a == ((C0770u) obj).f12687a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f12687a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return X.c.f(this.f12687a, "}", new StringBuilder("LogResponse{nextRequestWaitMillis="));
    }
}
