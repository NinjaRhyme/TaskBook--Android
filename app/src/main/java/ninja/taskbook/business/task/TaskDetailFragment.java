package ninja.taskbook.business.task;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

import ninja.taskbook.R;
import ninja.taskbook.model.data.DataManager;
import ninja.taskbook.model.entity.TaskEntity;

//----------------------------------------------------------------------------------------------------
public class TaskDetailFragment extends Fragment {

    //----------------------------------------------------------------------------------------------------
    TextView mIdTextView;
    TextView mNameTextView;
    TextView mTaskBeginningCalendarTextView;
    TextView mTaskBeginningTimeTextView;
    TextView mTaskDeadlineCalendarTextView;
    TextView mTaskDeadlineTimeTextView;
    TextView mContentTextView;
    TextView mProgressTextView;
    int mTaskId = 0;
    TaskEntity mTaskInfo = null;
    TaskEntity mTempTaskInfo = null;

    //----------------------------------------------------------------------------------------------------
    public TaskDetailFragment() {

    }

    //----------------------------------------------------------------------------------------------------
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    //----------------------------------------------------------------------------------------------------
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.task_detail, container, false);

        // Id
        mIdTextView = (TextView)rootView.findViewById(R.id.id_text_view);
        mIdTextView.setText("id");

        // Name
        mNameTextView = (TextView)rootView.findViewById(R.id.name_text_view);
        mNameTextView.setText("name");

        // Beginning
        mTaskBeginningCalendarTextView = (TextView)rootView.findViewById(R.id.beginning_calendar_text_view);
        mTaskBeginningCalendarTextView.setText("beginning");
        mTaskBeginningTimeTextView = (TextView)rootView.findViewById(R.id.beginning_time_text_view);
        mTaskBeginningTimeTextView.setText("beginning");

        // Deadline
        mTaskDeadlineCalendarTextView = (TextView)rootView.findViewById(R.id.deadline_calendar_text_view);
        mTaskDeadlineCalendarTextView.setText("deadline");
        mTaskDeadlineTimeTextView = (TextView)rootView.findViewById(R.id.deadline_time_text_view);
        mTaskDeadlineTimeTextView.setText("deadline");

        // Content
        mContentTextView = (TextView)rootView.findViewById(R.id.content_text_view);
        mContentTextView.setText("content");

        // Progress
        mProgressTextView = (TextView)rootView.findViewById(R.id.progress_text_view);
        mProgressTextView.setText("progress");

        // Alert
        Button alertButton = (Button)rootView.findViewById(R.id.alert_task_button);
        alertButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                alert();
            }
        });

        // Edit
        Button editButton = (Button)rootView.findViewById(R.id.edit_task_button);
        editButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                edit();
            }
        });

        // Data
        mTaskId = getArguments().getInt("id");
        mTaskInfo = DataManager.getInstance().getTaskItem(mTaskId);
        mTempTaskInfo = new TaskEntity(mTaskInfo);
        if (mTaskInfo == null || mTaskInfo.taskUserRole != 0)
        {
            alertButton.setVisibility(View.INVISIBLE);
        }

        // Load
        loadTaskData();

        return rootView;
    }

    //----------------------------------------------------------------------------------------------------
    private void loadTaskData() {
        if (mTaskInfo != null) {
            mIdTextView.setText(String.valueOf(mTaskInfo.taskId));
            mNameTextView.setText(mTaskInfo.taskName);
            try {
                JSONObject beginningJsonData = new JSONObject(mTaskInfo.taskBeginning);
                mTaskBeginningCalendarTextView.setText(beginningJsonData.getString("calendar"));
                mTaskBeginningTimeTextView.setText(beginningJsonData.getString("time"));
                JSONObject deadlineJsonData = new JSONObject(mTaskInfo.taskDeadline);
                mTaskDeadlineCalendarTextView.setText(deadlineJsonData.getString("calendar"));
                mTaskDeadlineTimeTextView.setText(deadlineJsonData.getString("time"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            mContentTextView.setText(mTaskInfo.taskContent);
            mProgressTextView.setText(String.valueOf(mTaskInfo.taskProgress));
        }
    }

    //----------------------------------------------------------------------------------------------------
    private void alert() {
        DataManager.getInstance().requestAlertTask(mTempTaskInfo,
                new DataManager.RequestCallback<Boolean>() {
                    @Override
                    public void onResult(Boolean result) {
                        if (result) {
                            Toast toast = Toast.makeText(getContext(), "提醒成功", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER, 0, 0);
                            toast.show();
                        } else {
                            Toast toast = Toast.makeText(getContext(), "提醒失败", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER, 0, 0);
                            toast.show();
                        }
                    }
                }
        );
    }

    //----------------------------------------------------------------------------------------------------
    private void edit() {
        DataManager.getInstance().requestEditTask(mTempTaskInfo,
                new DataManager.RequestCallback<Boolean>() {
                    @Override
                    public void onResult(Boolean result) {
                        if (result) {
                            mTaskInfo.setTaskEntity(mTempTaskInfo);
                            Toast toast = Toast.makeText(getContext(), "修改成功", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER, 0, 0);
                            toast.show();
                        } else {
                            Toast toast = Toast.makeText(getContext(), "修改失败", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER, 0, 0);
                            toast.show();
                        }
                    }
                }
        );
    }
}
