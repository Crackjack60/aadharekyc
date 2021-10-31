package com.mscode.otpverficationvt;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class helper {

    private DatabaseReference databaseReference;
    public helper()
    {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(helper.class.getSimpleName());
    }
    public Task<Void> add(UserHelperClass emp)
    {

        return databaseReference.push().setValue(emp);

    }

}
