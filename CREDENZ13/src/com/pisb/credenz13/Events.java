package com.pisb.credenz13;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import com.pisb.credenz13.Events;
import com.pisb.credenz13.R;
 
/**
	
 * @author mwho
 *
 */
public class Events extends Fragment {
    /** (non-Javadoc)
     * @see android.support.v4.app.Fragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)
     */
	private ImageButton clash_button;
    private Button clash_t;
    private ImageButton paper_button;
    private Button paper_t;
    private ImageButton roboliga_button;
    private Button roboliga_t;
    private ImageButton webweaver_button;
    private Button webweaver_t;
    private ImageButton pixelate_button;
    private Button pixelate_t;
    private ImageButton quiz_button;
    private Button quiz_t;
    private ImageButton bplan_button;
    private Button bplan_t;
    private ImageButton mad_button;
    private Button mad_t;
    private ImageButton nth_button;
    private Button nth_t;
    private ImageButton seminars_button;
    private Button seminars_t;
    private ImageButton workshop_button;
    private Button workshop_t;
    private ImageButton soft_dev_button;
    private Button soft_dev_t;
    private ImageButton croodle_button;
    private Button croodle_t;
    private ImageButton xodia_button;
    private Button xodia_t;
    

    
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
    	View view= inflater.inflate(R.layout.activity_events,
                container, false);
        if (container == null) {
            // We have different layouts, and in one of them this
            // fragment's containing frame doesn't exist.  The fragment
            // may still be created from its saved state, but there is
            // no reason to try to create its view hierarchy because it
            // won't be displayed.  Note this is not needed -- we could
            // just run the code below, where we would create and return
            // the view hierarchy; it would just never be used.
            return null;
        }
        clash_button=(ImageButton) view.findViewById(R.id.clash_button);
        clash_button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getActivity(),Clash.class);
				getActivity().startActivity(intent);
			}	
        });
			clash_t=(Button) view.findViewById(R.id.clash_t);
	        clash_t.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getActivity(),Clash.class);
					getActivity().startActivity(intent);
				}
	     });
	        paper_button=(ImageButton) view.findViewById(R.id.paper_button);
	        paper_button.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getActivity(),PaperPresentation.class);
					getActivity().startActivity(intent);
				}	
	        });
				paper_t=(Button) view.findViewById(R.id.paper_t);
		        paper_t.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(getActivity(),PaperPresentation.class);
						getActivity().startActivity(intent);
					}
		     });
		    
	        roboliga_button=(ImageButton) view.findViewById(R.id.roboliga_button);
	        roboliga_button.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getActivity(),Roboliga.class);
					getActivity().startActivity(intent);
				}	
	        });
				roboliga_t=(Button) view.findViewById(R.id.roboliga_t);
		        roboliga_t.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(getActivity(),Roboliga.class);
						getActivity().startActivity(intent);
					}
		     });
		    
	        pixelate_button=(ImageButton) view.findViewById(R.id.pixelate_button);
	        pixelate_button.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getActivity(),Pixelate.class);
					getActivity().startActivity(intent);
				}	
	        });
				pixelate_t=(Button) view.findViewById(R.id.pixelate_t);
		        pixelate_t.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(getActivity(),Pixelate.class);
						getActivity().startActivity(intent);
					}
		     });
		     
		        nth_button=(ImageButton) view.findViewById(R.id.nth_button);
		        nth_button.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(getActivity(),NTH.class);
						getActivity().startActivity(intent);
					}	
		        });
					nth_t=(Button) view.findViewById(R.id.nth_t);
			        nth_t.setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							Intent intent = new Intent(getActivity(),NTH.class);
							getActivity().startActivity(intent);
						}
			     });
			     
	        webweaver_button=(ImageButton) view.findViewById(R.id.webweaver_button);
	        webweaver_button.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getActivity(),Webweaver.class);
					getActivity().startActivity(intent);
				}	
	        });
				webweaver_t=(Button) view.findViewById(R.id.webweaver_t);
		        webweaver_t.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(getActivity(),Webweaver.class);
						getActivity().startActivity(intent);
					}
		     });
		    
	        quiz_button=(ImageButton) view.findViewById(R.id.quiz_button);
	        quiz_button.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getActivity(),Quiz.class);
					getActivity().startActivity(intent);
				}	
	        });
				quiz_t=(Button) view.findViewById(R.id.quiz_t);
		        quiz_t.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(getActivity(),Quiz.class);
						getActivity().startActivity(intent);
					}
		     });
		    
	        bplan_button=(ImageButton) view.findViewById(R.id.bplan_button);
	        bplan_button.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getActivity(),BPlan.class);
					getActivity().startActivity(intent);
				}	
	        });
				bplan_t=(Button) view.findViewById(R.id.bplan_t);
		        bplan_t.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(getActivity(),BPlan.class);
						getActivity().startActivity(intent);
					}
		     });
		    
	        mad_button=(ImageButton) view.findViewById(R.id.mad_button);
	        mad_button.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getActivity(),MAD.class);
					getActivity().startActivity(intent);
				}	
	        });
				mad_t=(Button) view.findViewById(R.id.mad_t);
		        mad_t.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(getActivity(),MAD.class);
						getActivity().startActivity(intent);
					}
		     });
		    
	        workshop_button=(ImageButton) view.findViewById(R.id.workshop_button);
	        workshop_button.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(getActivity(),Workshop.class);
					getActivity().startActivity(intent);
				}	
	        });
				workshop_t=(Button) view.findViewById(R.id.workshop_t);
		        workshop_t.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(getActivity(),Workshop.class);
						getActivity().startActivity(intent);
					}
		     });
		        
		        soft_dev_button=(ImageButton) view.findViewById(R.id.soft_dev_button);
		        soft_dev_button.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(getActivity(),Software_dev.class);
						getActivity().startActivity(intent);
					}	
		        });
					soft_dev_t=(Button) view.findViewById(R.id.soft_dev_t);
			        soft_dev_t.setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							Intent intent = new Intent(getActivity(),Software_dev.class);
							getActivity().startActivity(intent);
						}
			     });
		    
			        croodle_button=(ImageButton) view.findViewById(R.id.croodle_button);
			        croodle_button.setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							Intent intent = new Intent(getActivity(),Croodle.class);
							getActivity().startActivity(intent);
						}	
			        });
						croodle_t=(Button) view.findViewById(R.id.croodle_t);
				        croodle_t.setOnClickListener(new View.OnClickListener() {
							
							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Intent intent = new Intent(getActivity(),Croodle.class);
								getActivity().startActivity(intent);
							}
				     });
				        xodia_button=(ImageButton) view.findViewById(R.id.xodia_button);
				        xodia_button.setOnClickListener(new View.OnClickListener() {
							
							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Intent intent = new Intent(getActivity(),XOdia.class);
								getActivity().startActivity(intent);
							}	
				        });
							xodia_t=(Button) view.findViewById(R.id.xodia_t);
					        xodia_t.setOnClickListener(new View.OnClickListener() {
								
								@Override
								public void onClick(View v) {
									// TODO Auto-generated method stub
									Intent intent = new Intent(getActivity(),XOdia.class);
									getActivity().startActivity(intent);
								}
					     });
	        
        return view;
    }
}